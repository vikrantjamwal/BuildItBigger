Build It Bigger
====

### Project Overview
In this project, we will create an app with multiple flavors that uses multiple libraries and Google Cloud Endpoints. The finished app will consist of four modules:

1. A Java library that provides jokes
2. A Google Cloud Endpoints (GCE) project that serves those jokes
3. An Android Library containing an activity for displaying jokes
4. An Android app that fetches jokes from the GCE module and passes them to the Android Library for display
  
### Screenshots
<img src="https://cloud.githubusercontent.com/assets/20086830/24567897/3be8c116-167d-11e7-8246-92d8df9add38.png" height=520 width =290/> <img src="https://cloud.githubusercontent.com/assets/20086830/24567921/563c643c-167d-11e7-8a32-2d92aee2223e.png" height=520 width =290/> <img src="https://cloud.githubusercontent.com/assets/20086830/24567946/782eb18a-167d-11e7-9789-6a4ac94d5750.png" height=520 width =290/>

### Why this project?
As Android projects grow in complexity, it becomes necessary to customize the behavior of the Gradle build tool, allowing automation of repetitive tasks. Particularly, factoring functionality into libraries and creating product flavors allow for much bigger projects with minimal added complexity.

### What will I learn?
* Add free and paid flavors to an app, and set up the build to share code between them.
* Factor reusable functionality into a Java library.
* Factor reusable Android functionality into an Android library.
* Configure a multi-project build to compile the libraries and app.
* Use the Gradle App Engine plugin to deploy a backend.
* Configure an integration test suite that runs against the local App Engine development server.
