from flask import Flask, render_template, request

app = Flask(__name__)

# Lista de médicos e horários disponíveis
medicos = {
    'Dr. João': ['08:00', '10:00', '14:00'],
    'Dra. Maria': ['09:00', '11:00', '15:00'],
    # Adicione mais médicos e horários conforme necessário
}

@app.route('/')
def index():
    return render_template('index.html', medicos=medicos)

@app.route('/agendar', methods=['POST'])
def agendar():
    medico = request.form['medico']
    horario = request.form['horario']
    # Adicione lógica para agendar a consulta aqui
    return f"Consulta agendada com {medico} para as {horario}."

if __name__ == '__main__':
    app.run(debug=True)
