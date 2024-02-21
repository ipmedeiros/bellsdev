document.addEventListener('DOMContentLoaded', function() {
    const menuToggle = document.getElementById('menu-toggle');
    const mainMenu = document.getElementById('main-menu').querySelector('ul');
  
    menuToggle.addEventListener('click', function() {
      mainMenu.classList.toggle('active');
      const isOpen = mainMenu.classList.contains('active');
      menuToggle.textContent = isOpen ? 'Fechar Menu' : 'Abrir Menu';
    });
  });
  