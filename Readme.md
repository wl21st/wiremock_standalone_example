# Steps to Run 

1. baseUrl for all your API Calls = http://localhost:8089
2. Separate file for every "end-point" with unique name, to be stored in "src > test > resources > mapping > *.json"
3. Maven is installed and is available in env
4. From root folder run `mvn exec:java -Dexec.args="start"`
5. Open Browser enter - "http://localhost:8089/hello-world"

**Response should be "Hello World!"**

For the release, stop the class manually.
