let displayValue = '';

function addToDisplay(value) {
    displayValue += value;
    document.getElementById('display').value = displayValue;
}

function clearDisplay() {
    displayValue = '';
    document.getElementById('display').value = '';
}

function calculateResult() {
    try {
        const result = eval(displayValue);
        document.getElementById('display').value = result;
        displayValue = '';
    } catch (error) {
        document.getElementById('display').value = 'Error';
    }
}
