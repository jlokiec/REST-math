# REST-math
To build the project, type ```mvnw clean install``` command in main project directory.  

# Adding numbers
POST /add/{val1}/{val2}  

# Dividing numbers
GET /div/{val1}/{val2}  
If val2 is zero, response has 400 Bad request code.
