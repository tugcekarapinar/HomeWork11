public class TestCase {
    private String testName;
    private String testDescription;

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    @Override
    public String toString() {
        return "Test Case [Test Name = " + testName + ", Test Description = " + testDescription + "]";
    }
}