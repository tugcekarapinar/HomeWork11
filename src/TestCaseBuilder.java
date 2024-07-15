public class TestCaseBuilder {
    private TestCase product;

    public TestCaseBuilder() {
        this.product = new TestCase();
    }

    public TestCaseBuilder withPart1(String part1) {
        product.setTestName(part1);
        return this;
    }

    public TestCaseBuilder withPart2(String part2) {
        product.setTestDescription(part2);
        return this;
    }

    public TestCase build() {
        return product;
    }
}