# event-driven-microservice
This application is following event-driven-microservice with active mq 

 
Monolithic vs. Microservices 

=============================

Monolithic
===========

Flexibility: 
Monolithic architecture is not flexible. We can’t use different technologies. The technology stack is decided at the start and followed we can not move another technologies.

Reliability: It's not reliable. If one feature goes down, the entire application might go down.

Development speed:Development speed is very low,bcz all modules are depend on each other,if we take all modules in any ide like elispe or sts,we will get ide permance issue bcz size of the application.


Building complex applications: It's difficult to build a complex application because of the limitations in terms of technologies.

Scalability:once application deployed we have to maintain difference servers,we have to apply the load balancer for those servers,it is very costly.
 deploying the application is also it will take time.
 
 
 Continuous deployment: maintain Continuous deployment in application is very difficult.

 Microservices 
 ===========
 
Flexibility: 
Microservices architecture is n flexible. We can use different technologies. we can move different technologies in micro service
we can develop micro services with different technologies

A micro service develop with java

B micro service develop with .net

c micro service develop with node.js


Reliability: Microservices is reliable. If one feature goes down, the entire application wont go down.

A micro service down it wont effect on B micro service.

Development speed:Microservices Development speed is very high,bcz each micro service is independent development and independent deployable.

Developer one: can develop A micro service with java independently and deploying into server independently.

Developer two: can develop B micro service with java independently and deploying into server independently.


Building complex applications: We can not build the complex application in micro service.
       if any micro service is complex ,we can move another technologies to develop the micro service.
	   
	   
Scalability: Microservices is Scalability bcz it is independent development

independent deployable,if any micro service is down we can up another service with zero downtime.
each micro service has each database.


Continuous deployment: Microservices can easily support Continuous deployment.
