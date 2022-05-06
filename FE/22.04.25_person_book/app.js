const personsList = document.querySelector('.persons-list');
let personsArray = [];

const openModalEl = document.querySelector('.open-modal-btn');
const modal = document.querySelector('.form-modal-wrapper');
const form = document.querySelector('.form-modal-form');
const modalCloseBtn = document.querySelector('.form-modal-form span');
const modalOpenBtn = document.querySelector('.open-modal-btn');

// form elements
const fields = document.querySelectorAll('input');

// create delete btn in card
const createDeleteBtn = (person) => {
  const deleteBtn = document.createElement('span');
  deleteBtn.classList.add('delete-btn');
  deleteBtn.innerHTML = '<i class="fa-solid fa-user-xmark"></i>';
  deleteBtn.addEventListener('click', (event) => {
    event.preventDefault();
    removePersonCard(person);
    renderPersonsArray();
  });
  return deleteBtn;
};

// create edit btn in card
const createEditBtn = (person) => {
  const editBtn = document.createElement('span');
  editBtn.classList.add('edit-btn');
  editBtn.innerHTML = '<i class="fa-solid fa-user-pen"></i>';
  editBtn.addEventListener('click', (event) => {
    event.preventDefault();
    editPersonCard(person);
    renderPersonsArray();
  });
  return editBtn;
} 

// create name element for person card
const createName = (obj) => {
  const personName = document.createElement('p');
  personName.classList.add('person-card-name');
  personName.textContent = obj.name + ' ' + obj.surname;
  return personName;
};

//create description element for person card
const createDescription = (obj) => {
  const personLinksWrapper = document.createElement('div');
  personLinksWrapper.classList.add('person-links-wrapper');
  const personPhone = document.createElement('a');
  personPhone.classList.add('person-phone');
  personPhone.textContent = obj.tel;
  personPhone.href = 'tel:' + obj.tel;
  const personEmail = document.createElement('a');
  personEmail.classList.add('person-email');
  personEmail.textContent = obj.email;
  personEmail.href = 'mailto:' + obj.email;  // ???
  const personImage = document.createElement('a');
  personImage.classList.add('person-image');
  personImage.textContent = 'Photo link';
  personImage.href = obj.photoLink;

  personLinksWrapper.appendChild(personPhone);
  personLinksWrapper.appendChild(personEmail);
  personLinksWrapper.appendChild(personImage);
  return personLinksWrapper;
};

//create new person card
const createNewPersonCard = (obj) => {
  const personItem = document.createElement('li');
  personItem.classList.add('person-card');
  // avatar
  const personAvatar = document.createElement('span');
  personAvatar.classList.add('person-card-avatar');

  personItem.appendChild(personAvatar);
  personItem.appendChild(createName(obj));
  personItem.appendChild(createDescription(obj));
  personItem.appendChild(createDeleteBtn(obj));
  personItem.appendChild(createEditBtn(obj));
  return personItem;
};

const renderPersonsArray = () => {
  personsList.innerHTML = '';
  personsArray.forEach((person) => {
    personsList.prepend(createNewPersonCard(person));
  });
  personsList.appendChild(modalOpenBtn);
};

// create new Person from form
const createNewPerson = () => {
  const newPerson = {
    id: Date.now(),
  };
  fields.forEach(field => {
    newPerson[field.id] = field.value;
  });
  return newPerson;
};

// remove Person 
const removePersonCard = (person) => {
  // const index = personsArray.indexOf(person);
  // if(index > -1){
  //   personsArray.splice(index, 1);
  // }
  personsArray = personsArray.filter(item => item.id !== person.id);
};

// edit Person
const editPersonCard = (person) => {
  modal.style.display = 'flex';
  addPersonToForm(person);
  removePersonCard(person);
};

const clickHandler = () => {
  const newPerson = createNewPerson();

  if(!isPersonNew(newPerson)) {
    return;
  };

  personsArray.push(newPerson);
  renderPersonsArray(personsArray);
};

const cleanForm = () => {
  fields.forEach(field => {
    field.value = '';
  });
};

const addPersonToForm = (obj) => {
  fields.forEach(field => {
    field.value = obj[field.id];
  });
};

const isFormValide = () => {
  return fields[0].value.trim() !== '' && fields[2].value.trim() !== ''; // ???
};

const isPersonNew = (person) => {
  return !personsArray.find(item => item.tel === person.tel);
}

// open modal
openModalEl.addEventListener('click', () => {
  modal.style.display = 'flex';
});

// close modal
modalCloseBtn.addEventListener('click', () => {
  modal.style.display = 'none';
});

// form submit
form.addEventListener('submit', (event) => {
  event.preventDefault();
  if(isFormValide()){
    clickHandler();
  }
  cleanForm();
  modal.style.display = 'none';
});

renderPersonsArray(personsArray);
