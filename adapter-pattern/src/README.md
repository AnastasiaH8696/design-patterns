You asked your sub contractor to define a class that implements the following interface:

```
public interface IFilesDAO
{
public void writeIntToFile(String filename, int number) throws FilesDAOException;
public int readIntFromFile(String filename) throws FilesDAOException;
public void copyIntegerFromFileToFile(String filename1, String filename2) throws FilesDAOException;
}
```

The sub contractor chose to define a class that implements the ISimpleFilesDAO interface:
```
public interface ISimpleFilesDAO
{
public void writeIntegerToFile(String filename, int number) throws FilesDAOException;
public int readIntegerFromFile(String filename) throws FilesDAOException;
}
```

The name of the class that the sub contractor defines is SimpleFilesDAO.

You should implement the Adapter design pattern in order to solve the problem. 