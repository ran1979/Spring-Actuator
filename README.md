# Spring-Actuator
This is a quick demo for spring actuator, for exposing management apis (health, metrics ...)

This project contains spring boot web and actuator dependencies.
The managment port on 8081 and the server port is 8080.
<p>
<b>The application contains one controller which exposed on root context:</b>
<br/>
localhost:8080/
<br/>
{hello}
<p>
<b>Management api example:</b>
<br/>
http://localhost:8081/application/metrics
<br/>
http://localhost:8081/application/beans
<br/>
http://localhost:8081/application/health
<br/>
http://localhost:8081/application/mappings
