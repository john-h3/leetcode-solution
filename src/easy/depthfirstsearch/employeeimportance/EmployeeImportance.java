package easy.depthfirstsearch.employeeimportance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EmployeeImportance
 *
 * @author john 2021/2/6
 */
public class EmployeeImportance {
  class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
  }

  class Solution {
    public int getImportance(List<Employee> employees, int id) {
      var map = new HashMap<Integer, Employee>();
      employees.forEach(e->map.put(e.id,e));
      return sum(map, map.get(id));
    }
    
    private int sum(Map<Integer,Employee> map, Employee e) {
      return e.importance + e.subordinates.stream().map(map::get).mapToInt(i->sum(map, i)).sum();
    }
  }
}
