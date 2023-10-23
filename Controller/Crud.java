
package Controller;

import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public interface Crud<Class> {
    public boolean add(Class obj);
    public Class read(String id);
    public List<Class> readAll();
    public boolean update(Class obj);
    public boolean delete(Class obj);
}
