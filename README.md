[![Build Status](https://www.travis-ci.org/iamfoxuriel/mall.svg?branch=master)](https://www.travis-ci.org/iamfoxuriel/mall)


# flyway to refresh db
## h2 

You can look at `http://localhost:8080/actuator/flyway`  to review the list of scripts.
This sample also enables the H2 console (at `http://localhost:8080/h2-console`)
so that you can review the state of the database (the default jdbc url is
`jdbc:h2:mem:testdb`).