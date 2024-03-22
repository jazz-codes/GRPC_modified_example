# GRPC_modified_example

**1. Modifying the .proto file**

in the .proto file i added the attributes: lastname, cin, age and gender to the  HelloRequest message.

 here is the modified version:
 

    message HelloRequest 
    {
    string name = 1;
    string lastname = 2;
    int32 cin = 3;
    int32 age = 4;
    string gender = 5;
    }

**2. Building the pom.xml file and generating the stubs using Maven Plugin**

**3. Modifying the classes  GreeterImpl and HelloWorldClient**

integrating the added attributes  to the methods sayHello and sayHelloAgain (in the GreeterImpl class) and to the method greet (in the HelloWorldClient class)

 **4. Execution**
 * on the server side
   ![image](https://github.com/jazz-codes/GRPC_modified_example/assets/152726047/4988f150-2f43-40f4-a061-e22a1bafe545)

 * on the client side
   ![image](https://github.com/jazz-codes/GRPC_modified_example/assets/152726047/a1ab4438-8466-41b9-86f4-9781ce079240)


