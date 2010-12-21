This project aim to extend the android BOOTCLASSLOADER to support scala application

Requirement
* Maven
* Android SDK

How to use it ?

    cd scala.library.android

edit the pom.xml with your android sdk path.

    mvn install

This command will push scala dexed library to /data/framework

The script will also print a sed command to add the generated jars in the android BOOTCLASSLOADER

To test your new extended classloader.

    cd scala.library.android.tester
    mvn install
    mvn android:deploy

It will install a sample application using Scala into android environnement.











Disclaimer: I’m not responsible for any damage you may do to your phone by installing this