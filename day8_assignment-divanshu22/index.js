function validatename(){
    let v=document.getElementById("name").value;
    if(v.length<6){
        
        document.getElementById("result").innerHTML="<font color=red>LENGTH IS LESS THAN 6 LETTERS</font>";
    }
         else{
                    document.getElementById("result").innerHTML="<font color=green>LENGHT IS OKAY</font>";
              }
    console.log(v);
}