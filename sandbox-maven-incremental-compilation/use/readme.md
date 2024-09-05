---
id: readme
tags: []
---
- Run mvn install to check results. (not clean install). It will compile only changed files.

- useIncrementalCompilation set to false (not recommended)
    - This will only compile source files which are newer than their corresponding class files, i.e. which have been
      changed since the last compilation process. As @Ivan notes in a comment on another answer, this will not recompile
      other classes which use the changed class, potentially leaving them with references to methods that no longer
      exist, leading to errors at runtime.

- https://stackoverflow.com/questions/16963012/maven-compiler-recompile-all-files-instead-modified