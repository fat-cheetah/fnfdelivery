## FNF Delivery

# Delivery Management Software

Inspired from https://eng.uber.com/tech-stack-part-one-foundation/ , https://eng.uber.com/service-oriented-architecture/

Requirements

Automated Dispatch & Delivery

Have your pickups & deliveries auto assigned to your nearest & free delivery agents as soon as the order is prepared. 

Tracking & Route Optimization

Get delivery tracking system to monitor workforce in real-time. Plan ahead with optimized routes for managing delivery services. 



DISCO -> Dispatch Optimization

Input -> Location Data from Map (Lat, Long) 

Solution - Google S2 Library -> Divides earth's data into 1 km x 1 km chunks which are uniquely identifiable.
Uses :- Can access data quickly based on s2 index. and also able to distribute data using s2 as partition key via consistent hashing.

Another uses:- Problem -> Get all the supplies within a particular circle. s2 gives all the area ids in that circle and we can figure the supply partners in those ids.


Problem Statement -> Match customer to a delivery person.

1 -> Find all the nearest delivery persons within a certain radius (1-2 km)
2 -> Find ETA for them

So if you want to match  a customer to a delivery person. 

Every x seconds riders send their location to the kafka rest api through the load balancer and thereby consumed from kafka queue to multiple places.

Web Sockets
allow a long-held single TCP socket connection to be established between the client and server which allows for bi-directional, full duplex, messages to be instantly distributed with little overhead resulting in a very low latency connection.


Dispatch Optimization - Consistent Hashing + Gossip Protocol -> Divide Work based on location ids.

Geospatial Design

1. S2 Library
2. Building Maps - Use google library for ETA
3. Preferred Access Points -> Not applicable for our cases.

ETA -> Not only idle riders but active riders.

Database Choice -> Low Traffic -> RDBMS works

NOSQL -> Horizontal Scaling, Scales better.

Write vs Read -> Write Heavy Application when riders push gps data.


Analytics -> HDFS (Pig for Query)

Logging System -> ELK Stack

Fraud Detection -> (Riders, Suppliers, Consumers)

Payment System

DataCenter Failure -> Backup DC


## Tech Stack

###Frontend 
Website 
-> Desktop Application
-> Mobile Website
-> Android App
-> iOS App

Desktop Application -> User Website(Order , Signup, Login , Track) , Supplier Website (Update Inventory,Receive Orders/ Dashboard, Analytics)
Mobile Website (same as above)

Technologies (React/ Angular/ Handlebars/ Native) , Application (Android/iOS), User App, Agent App, Analytics

Android App -> User App (Sign up/ Login/ Order/ Track), Supplier App (Receive Orders/ Dashboard)

Cross Platform App Development

React Native vs Flutter

http://thrift.apache.org/ 
https://eng.uber.com/uber-tech-stack-part-two/ 

S2 Library -> https://s2geometry.io/about/overview, https://s2geometry.io/devguide/cpp/quickstart https://medium.com/@self.maurya/lesser-known-things-about-googles-s2-fea42f852f67 
https://github.com/google/s2geometry

Queueing -> AWS Kinesis, (Apache Kafka https://medium.com/@shastri.shankar9/apache-kafka-vs-amazon-kinesis-b55821c7f51f )


##Entities

### Suppliers


### Riders

### Customers


## Services

-> Services

1. Supplier Service -> Supplier Onboarding, Inventory Management System, Supplier UI (Analytics/ Dashboard)
