function checkInputs(){
    const uInput = document.getElementById("uName");
    const pInput = document.getElementById("pass")

    const username = "tian2001";
    const password = "qwerty";

    if(uInput.value == username && pInput.value == password){
        window.location.href = "home.html";
    }
    else{
        alert("Invalid credentials");
    }
}

function pPayment(){
    window.location.href = "payment.html";
}

function success(){
    alert("Payment Successful");
}

function back(){
    window.location.href = "home.html";
}