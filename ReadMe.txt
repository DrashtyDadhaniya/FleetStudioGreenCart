* Green Kart ecommerce website web automation is developed using Selenium+Java+TestNG framework
* This framework includes below things -
	1. It can take screenshot of failed testcases using TestNg listners
	2. It can generate extent reports for all passed testcaes & attach screenshot of failed testcaes using TestNg listners
	3. It can be run from Maven commands or using xml file
	4. It can be run on chrome, firefox or Edge browsers also it supports headless mode
	5. Browser can be set from config.properties file
	6. Used data providers for promocodes, assertations & Page Object model etc to build the framework
	7. It test the E2E execution of grrenkart web site 
		- Launches greenkart application
		- Add items to cart using array(If you wish to add some other products then open "EcommerceTest.java" file and modify the "itemsNeeded" array items )
		- View cart
		- proceed to checkout
		- Apply promocode
		- Place order
		- Select country in the drop down
		- Check On terms and Conditions
		- Proceed
		- Veryfy if "thank you" message is displayed or not

* How to run the framework -
	1. Can be run using testng.xml file given in the project(1st run might ask to enter code sent on email, for this you can once login manually then in "EcommerceTest.java" file set your name and emial id)
	2. Can be run using ‘mvn test’ command from maven command line
	4. Set browser values from maven usig ‘mvn test -Dbrowser=Chrome' command
	5. After execution, under 'reports' folder 'index.html' file will be generated. Also screenshot of failed test cases can be found under this folder

		
Note - Many other test cases can be validate but due to time limit I have choose to automate only E2E functionality.

