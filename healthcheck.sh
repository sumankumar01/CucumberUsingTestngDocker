echo "Checking if hub is ready - $HUB_HOST"

while [ "$( curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

java -cp java -cp  container-test.jar;container-test-tests.jar;libs/* \
    -DHUB_HOST=$HUB_HOST \
    -DBROWSER=$BROWSER \
   -Dcucumber.options="classpath:Features" \
     org.testng.TestNG  -testclass  CucumberOptions.TestRunner