Welcome to CareCompare 

Concept:  Developing a consumer-facing website to provide a cost comparison of medical procedures based on hospitals in the user’s local area. Leveraging MySQL for the persistence layer, Spring Boot for the middle layer and Angular for the frontend. 

MVP Goals:
Frontend:
- User can choose a medical procedure from a drop down and enter a zip code
-Frontend will send zip and medical procedure id to Spring boot
-display list of hospitals that offer the procedure as well as price

Backend:
-Take in medical procedure and zip from front end and query db for relevant prices
-Take in hospital and procedure information through API

Current Status:
API can take in Hospital info and put information into mysql database locally
