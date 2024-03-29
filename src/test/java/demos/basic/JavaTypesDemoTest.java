package demos.basic;

import org.junit.jupiter.api.Test;
import demos.basic.syntax.JavaTypesDemo;

class JavaTypesDemoTest {

    @Test
    void typesDemo() {
        JavaTypesDemo.usingPrimitives();
    }

    @Test
    void stringDemoTest() {
        JavaTypesDemo.stringDemo();
    }

    @Test
    void passPrimitiveDemo() {
        JavaTypesDemo.primitivePassingDemo();
    }

    @Test
    void passReferenceDemo() {
        JavaTypesDemo.referencePassingDemo();
    }

    @Test
    void passStringDemo() {
        JavaTypesDemo.stringPassingDemo();
    }

    @Test
    void nullValueDemoTest(){
        JavaTypesDemo.nullValueDemo();
    }

}