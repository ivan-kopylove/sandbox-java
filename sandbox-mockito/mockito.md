- If you use the runner, you don't need to call MockitoAnnotations.initMocks() yourself - the runner calls it for you.
- The MockitoAnnotations.initMocks(this) will:
    - Instantiate the field annotated with @InjectMocks
    - Create a mock version of every field annotated with @Mock
    - Inject the @Mocks in the @InjectMocks variable's fields (or call its constructors or use its setters - it depends
      on what kind of Dependency Injection you use)
