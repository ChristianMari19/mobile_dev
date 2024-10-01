function triggerMode(){
    const amountPHP = parseFloat(document.getElementById('amountPHP').value)
    const convRate = 0.018
    let result = amountPHP * convRate
    result = result.toFixed(2)
    document.getElementById('res').textContent = result
}