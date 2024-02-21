// Script de interação no site (opcional)
document.addEventListener('DOMContentLoaded', function() {
    const contactForm = document.getElementById('contact-form');
  
    contactForm.addEventListener('submit', function(event) {
      event.preventDefault();
      const formData = new FormData(contactForm);
      const formDataJSON = JSON.stringify(Object.fromEntries(formData.entries()));
      console.log(formDataJSON);
      // Aqui você pode adicionar lógica para enviar os dados do formulário para um servidor ou serviço de e-mail
      alert('Mensagem enviada com sucesso!');
      contactForm.reset();
    });
  });
  
  