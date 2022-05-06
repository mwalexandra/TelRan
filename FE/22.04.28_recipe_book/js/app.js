
const form = document.querySelector('.recipe-form');
const fields = document.querySelectorAll('input');
const recipeText = document.getElementById('recipeText');
const openFormBtn = document.querySelector('.open-form-btn');
const scrolbars = document.querySelectorAll('.scrollbar');

const recipesList = document.querySelector('.recipes-list');

let recipesArray =[];

const createNewRecipe = () =>{
  const newRecipe = {
    id: Date.now(),
    recipeText: recipeText.value,
  };
  fields.forEach(field => {
    newRecipe[field.id] = field.value;
  });
  recipesArray.push(newRecipe);
};

const createNewRecipeCard = (obj) => {
  const li = document.createElement('li');
  li.classList.add('recipe-card');
  const descrWrapper = document.createElement('div');
  descrWrapper.classList.add('recipe-card-descr-wrapper');
  const heading = document.createElement('h3');
  heading.classList.add('recipe-card-heading');
  heading.textContent = obj.recipeName;
  const text = document.createElement('p');
  text.classList.add('recipe-card-descr', 'scrollbar');
  text.textContent = obj.recipeText;

  descrWrapper.appendChild(heading);
  descrWrapper.appendChild(text);
  li.appendChild(createDeleteBtn(obj));
  li.appendChild(createRecipeImage(obj));
  li.appendChild(descrWrapper);

  return li;
};

const createRecipeImage = (obj) => {
  const figure = document.createElement('figure');
  figure.classList.add('recipe-card-figure');
  const img = document.createElement('img');
  img.setAttribute('src', obj.recipePhoto);
  figure.appendChild(img);
  return figure;
}

const createDeleteBtn = (recipe) => {
  const spanBtn = document.createElement('span');
  spanBtn.classList.add('delete-recipe-btn');
  spanBtn.addEventListener('click', (event) => {
    event.preventDefault();
    deleteRecipe(recipe);
    renderRecipesList(recipesArray);
  });
  return spanBtn;
};

const deleteRecipe = (recipe) => {
  recipesArray = recipesArray.filter(item => item.id !== recipe.id);
}

const renderRecipesList = (array) => {
  recipesList.innerHTML = '';
  array.forEach(item => {
    recipesList.appendChild(createNewRecipeCard(item));
  });
};

const switchForm = () => {
  form.classList.toggle('is-opened');
}

// clean form inputs
const cleanForm = () => {
  fields.forEach(field => {
    field.value = '';
  });
  recipeText.value = '';
}

// open form
openFormBtn.addEventListener('click', (event) => {
  switchForm();
});

// add recipe
form.addEventListener('submit', (event) => {
  event.preventDefault();
  createNewRecipe();
  renderRecipesList(recipesArray);
  cleanForm();
  form.classList.remove('is-opened');
});

// scrollbar
scrolbars.forEach((scrollbar) => {
  const simpleBar = new SimpleBar(scrollbar, { 
    autoHide: false
  });
  simpleBar.getScrollElement();
});

renderRecipesList(recipesArray);


