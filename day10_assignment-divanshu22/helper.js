function printError(elemId, hintMsg){
    document.getElementById(elemId).innerHTML = hintMsg;
}

function validateForm() 
   {
    var nm = document.covidvaccine.nm.value;
    var gender = document.covidvaccine.gender.value;
    var age = document.covidvaccine.age.value;
    var preference = document.covidvaccine.preference.value;
    } 
    var nameErr=genderErr=true;
    if(nm == ""){
        printError("nameErr", "Mandatory Field");
    }else{
        var regex= /^[a-zA-Z\s]+$/;
        if(regex.test(nm)===false){
            printError("nameErr", "Enter a valid name");
        }else{
            printError("nameErr", "");
            nameErr=false;
        }
    }
    if(gender == ""){
        printError("genderErr", "Mandatory Field")
    }else{
            printError("genderErr", "");
            genderErr=false;
        }
    if((nameErr || genderErr)==true){
return false;
    }else{
        var dataPreview = "Your Details:\n";
        "Name:" + name +"\n";
        "Gender:" + gender +"\n";
        "Age:"+age+"\n";
        "Preference"+preference+"\n";
        alert(dataPreview);
    }
function displayData(p){
	 
	  str="<table border='2' ><tr><th>Name</th><th>Second Dose</th><th>Side Effect</th><th>Precaution</th></tr>";
	 
		  str+="<tr>";
		  str+="<td>"+p[0].name+"</td><td>"+p[0].seconddose+"</td><td>"+p[0].sideeffects[0],p[0].sideeffects[1]+"</td><td>"+p[0].precautions[0],p[0].precautions[1]+"</td>";
		  str+="</tr>";
		  
		  
	  
	  str+="</table>";
	  alert(str);
	  document.getElementById("output2").innerHTML=str;
}
function getData(vaccine){
	  
	  xhr = new XMLHttpRequest();
	  //2. generate request
	  if(vaccine=="covidsheild")
	  { xhr.open('GET','covidsheild.json',true);}
	  else
	  {xhr.open('GET','covaxin.json',true);}
	  //3. configure the request
	  xhr.onreadystatechange=function(){
		  //alert("ready state"+xhr.readyState);
		  if((xhr.readyState==4) && (xhr.status==200)){
			  var data=xhr.responseText;
			  displayData(data);
		  }
	 }
	  //4. send the request
	 xhr.send(); 
}