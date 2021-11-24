function testVariable() {
    let strText = document.getElementById("name").value;          
    let strText1 = document.getElementById("gen").value;
    let strText2 = document.getElementById("age").value;
    var strText3 = document.getElementById("pre").value;
    var result = strText + ' ' + strText1+ ' ' + strText2+' ' + strText3;
    document.getElementById('spanResult').textContent = result;
     
}