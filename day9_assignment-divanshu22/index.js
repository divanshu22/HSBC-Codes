function validatename(){
    let v=document.getElementById("name").value;
    var message = "<font color=green>Length is okay.</font>"
    if(v.length<6)
        message = "<font color=red>Length is less than 6 letters.</font>"
        document.getElementById("result").innerHTML= message ; //"<font color=red>LENGTH IS LESS THAN 6 LETTERS</font>";
    
        // else{
                   // document.getElementById("result").innerHTML="<font color=green>LENGHT IS OKAY</font>";
             // }
    console.log(v);
}