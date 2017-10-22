import java.io.IOException;

import okhttp3.*;
import okhttp3.Request.Builder;
import java.io.*;

public class DataRequest {

	public DataRequest() {
		
	}
	
	/*
	 * Sends a server request to the CityIQ API and recieves the appropriate data based on the input url
	 */

	private String getData(String url) {

		OkHttpClient client = new OkHttpClient();

		okhttp3.Request request = new Request.Builder().url(url).get()
				.addHeader("authorization",
						"Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImxlZ2FjeS10b2tlbi1rZXkiLCJ0eXAiOiJKV1QifQ.eyJqdGkiOiJiNDczMzZmOGI2YjI0YTczYTM0NGIyNjBmZGRiY2I2MSIsInN1YiI6ImhhY2thdGhvbiIsInNjb3BlIjpbInVhYS5yZXNvdXJjZSIsImllLWN1cnJlbnQuU0RTSU0tSUUtUFVCTElDLVNBRkVUWS5JRS1QVUJMSUMtU0FGRVRZLkxJTUlURUQuREVWRUxPUCIsImllLWN1cnJlbnQuU0RTSU0tSUUtRU5WSVJPTk1FTlRBTC5JRS1FTlZJUk9OTUVOVEFMLkxJTUlURUQuREVWRUxPUCIsImllLWN1cnJlbnQuU0RTSU0tSUUtVFJBRkZJQy5JRS1UUkFGRklDLkxJTUlURUQuREVWRUxPUCIsImllLWN1cnJlbnQuU0RTSU0tSUUtUEFSS0lORy5JRS1QQVJLSU5HLkxJTUlURUQuREVWRUxPUCIsImllLWN1cnJlbnQuU0RTSU0tSUUtUEVERVNUUklBTi5JRS1QRURFU1RSSUFOLkxJTUlURUQuREVWRUxPUCJdLCJjbGllbnRfaWQiOiJoYWNrYXRob24iLCJjaWQiOiJoYWNrYXRob24iLCJhenAiOiJoYWNrYXRob24iLCJncmFudF90eXBlIjoiY2xpZW50X2NyZWRlbnRpYWxzIiwicmV2X3NpZyI6IjlmMWYyYzRkIiwiaWF0IjoxNTA4NjE1MjQ3LCJleHAiOjE1MDkyMjAwNDcsImlzcyI6Imh0dHBzOi8vODkwNDA3ZDctZTYxNy00ZDcwLTk4NWYtMDE3OTJkNjkzMzg3LnByZWRpeC11YWEucnVuLmF3cy11c3cwMi1wci5pY2UucHJlZGl4LmlvL29hdXRoL3Rva2VuIiwiemlkIjoiODkwNDA3ZDctZTYxNy00ZDcwLTk4NWYtMDE3OTJkNjkzMzg3IiwiYXVkIjpbImllLWN1cnJlbnQuU0RTSU0tSUUtVFJBRkZJQy5JRS1UUkFGRklDLkxJTUlURUQiLCJpZS1jdXJyZW50LlNEU0lNLUlFLVBBUktJTkcuSUUtUEFSS0lORy5MSU1JVEVEIiwiaWUtY3VycmVudC5TRFNJTS1JRS1QVUJMSUMtU0FGRVRZLklFLVBVQkxJQy1TQUZFVFkuTElNSVRFRCIsInVhYSIsImhhY2thdGhvbiIsImllLWN1cnJlbnQuU0RTSU0tSUUtRU5WSVJPTk1FTlRBTC5JRS1FTlZJUk9OTUVOVEFMLkxJTUlURUQiLCJpZS1jdXJyZW50LlNEU0lNLUlFLVBFREVTVFJJQU4uSUUtUEVERVNUUklBTi5MSU1JVEVEIl19.e34GxaL21aRbnaeEV-RXewxKG5HD6qNLOpYMxQy_XoLP2FMNHeaXku35dRx0n0btik2o8uZ9-wLE8UJ3qOdWMdF7i8loIQp55ko12chi8X3wVmIbcEC_DHnvg_LcvgB1hkKEHZvMw-WzxlbNL5aeOEaNJdg8lmt0EwhZ562FlfcXdpJAXgu5IpMWF9JL1KhKuoGyCDBI7xZDd54h5DrrU4hUkeLC-fOFX-1GDv6RplrXriPCWTbSsCCjwGJpDtbf87LzwWfJVunpKCboXjS1O5IB9YIQ8x0DPTalAMPJXcXaYvojJ1qxckIKi_I9ERQ4B55Lo3DJBFg1ekdIQF7idA")
				.addHeader("predix-zone-id", "SDSIM-IE-PEDESTRIAN").addHeader("cache-control", "no-cache")
				.addHeader("postman-token", "8180f556-b125-e969-8898-b70c82008a77").build();

		try {
			okhttp3.Response response = client.newCall(request).execute();
			return response.body().string();
		} catch (IOException e) {
			System.exit(1);
		}
		return null;
	}

	/*
	 * Returns pedestrian data
	 */
	
	public String getPedestrianData(int page) {
		return this.getData(
				"https://ic-event-service.run.aws-usw02-pr.ice.predix.io/v2/locations/events?eventType=PEDEVT&bbox=32.715675%3A-117.161230%2C32.708498%3A-117.151681&locationType=WALKWAY&startTime=1508456827000&endTime=1508975227000");
	}
	
	/*
	 * Returns vehicular data
	 */

	public String getVehicleData(int page) {
		return this.getData(
				"https://ic-event-service.run.aws-usw02-pr.ice.predix.io/v2/locations/events?eventType=TFEVT&bbox=32.715675%3A-117.161230%2C32.708498%3A-117.151681&locationType=TRAFFIC_LANE&startTime=1508456827000&endTime=1508975227000");
	}

	/*
	 * Returns location data
	 */
	
	public String getLocationData(int page) {
		return this.getData(
				"https://ic-metadata-service.run.aws-usw02-pr.ice.predix.io/v2/metadata/assets/CAM-HYP1071-F/locations");
	}

}
