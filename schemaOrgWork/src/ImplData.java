import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImplData {

	public String extension = "";
	public String typePkg = "";
	public String type = "";
	public String typeName = "";
	public Set<String> orgTypes = new HashSet<>();
	public String ifcName = "";
	public String ifcSmplName = "";
	public String ifcSmplCml = "";
	public String implName = "";
	public String implSmplName = "";
	public Map<String, Method[]> gsMap = new HashMap<>();
	public Map<String, Method> oMap = new HashMap<>();
	public Map<String, Class<?>> pMap = new HashMap<>();
	public List<String> ifcTree = new ArrayList<>();
	public Set<String> allIfcSet = new HashSet<>();
	public Map<String, String> ntvAtMap = new HashMap<>();
	public Map<String, String> ntvMdMap = new HashMap<>();
	public Set<String> domaConvNameSet = new HashSet<>();
	public Map<String, String> gsonTypeNameMap = new HashMap<>();

}
