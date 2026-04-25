package task10;

import java.util.HashMap;
import java.util.Map;

public class Tram extends PublicTransport{

    public Tram(String number) {
        this.number = number;
        this.engine = "electrical";
        this.isInUse = false;
    }

    protected String driverName;
    protected String ticketInspectorName;

    @Override
    public Map<String,String> getCrewComposition() {
        var answer = new HashMap<String, String>();
        answer.put("driver", this.driverName);
        answer.put("ticketInspector", this.ticketInspectorName);

        return answer;
    }
}
