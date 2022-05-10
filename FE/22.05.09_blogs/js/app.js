const users = JSON.parse(localStorage.getItem('users')) || [];
const blogs = JSON.parse(localStorage.getItem('blogs')) || [];
let activeUser = 0;

const usersBox = document.querySelector('.users');
const blogBox = document.querySelector('.blogs');
const form = document.querySelector('form');

const likeBtn = document.querySelector('.like-btn');
const dislikeBtn = document.querySelector('.dislike-btn');

const showBlogs = () => {
	const filteredData = blogs.filter(
		(article) => article.user_id === activeUser
	);
	renderBlogs(filteredData);
};

const renderBlogs = (articles) => {
	blogBox.innerHTML = '';
	articles.forEach((article) => {
		const element = createArticle(article);
		blogBox.appendChild(element);
	});
};

const createArticle = (article) => {
	const div = document.createElement('div');
	div.classList.add('article');
	div.innerHTML = `
    <div class="article__title">${article.title}</div>
    <div class="article__descr">
       ${article.description}
    </div>
    <div class="article__likes">${article.likes}</div>
    `;
  div.appendChild(createLikeBtn(article));
  div.appendChild(createDislikeBtn(article));
	return div;
};

const createLikeBtn = (article) => {
  const btn = document.createElement('button');
  btn.classList.add('btn', 'like-btn');
  btn.innerHTML = '<i class="fa-solid fa-thumbs-up"></i>';
  btn.addEventListener('click', (event) => {
    event.preventDefault();
    article.likes += 1;
    saveBlogs();
    renderBlogs(blogs);
  });
  return btn;
};

const createDislikeBtn = (article) => {
  const btn = document.createElement('button');
  btn.classList.add('btn', 'dislike-btn');
  btn.innerHTML = '<i class="fa-solid fa-thumbs-down"></i>';
  btn.addEventListener('click', (event) => {
    event.preventDefault();
    if (article.likes > 0) {
      article.likes -= 1;
    }
    saveBlogs();
    renderBlogs(blogs);
  });
  return btn;
};

const renderUsers = () => {
	usersBox.innerHTML = '';
	users.forEach((user) => {
		const div = document.createElement('div');
		div.classList.add('user');
		div.textContent = `${user.firstName} ${user.lastName}`;
		div.addEventListener('click', (event) => {
			event.preventDefault();
			activeUser = user.id;
			renderForm();
			showBlogs();
		});

		usersBox.appendChild(div);
	});
};

const renderForm = () => {
	document.querySelector('.form').style.display = 'block';
};

renderUsers();
renderBlogs(blogs);

form.addEventListener('submit', (event) => {
	event.preventDefault();
	if (activeUser === 0) return;
	const newArticle = {
		id: Date.now(),
		title: document.querySelector('#title').value,
		description: document.querySelector('#description').value,
		user_id: activeUser,
		likes: 0,
	};
	blogs.push(newArticle);
	saveBlogs();
	document.querySelector('#title').value = '';
	document.querySelector('#description').value = '';
	showBlogs();
});

// likeBtn.addEventListener('click')

const saveUsers = () => {
	localStorage.setItem('users', JSON.stringify(users));
};

const saveBlogs = () => {
	localStorage.setItem('blogs', JSON.stringify(blogs));
};