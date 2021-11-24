## Day 9 Assignment

Continuing the problem statement from Day 8:
1. On the server, create static Covishield.json and Covaxin.json files with the fields such as name, second dose duration, side effects, precautions, etc. For example, 
`{ "name": "Covishield",
   "seconddose": "28 days",
   "side effects": ["fever", "headache"],
   "precautions": [“Paracetamol for fever”,”consult doctor”]
   }
`
2. Ensure that these files can be accessed on the browser if a user types the appropriate URLs.
3. Modify the webpage created in Day 8 so that when the user clicks on Submit, an AJAX request for the appropriate file is made. The webpage should display the user details along with details from the data from the JSON file in a neatly formatted table. 
