echo "Checking if hub is ready - $HUB_HOST"

while [ "$( curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

 java -cp  target/container-test-tests.jar:target/libs/* \
    -DHUB_HOST=$HUB_HOST \
    -DBROWSER=$BROWSER \
   -Dcucumber.options="classpath:Features" org.testng.TestNG  -testclass  CucumberOptions.TestRunner