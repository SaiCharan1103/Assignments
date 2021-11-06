package q4;

public class pair<k,v>  {
		
		private k key;
		private v value;
		
		public pair(k key, v value) {
			super();
			this.key = key;
			this.value = value;
		}
	 
		@SuppressWarnings("hiding")
		public <k,v> String showData() {
			
			return key+"  "+value;
		}
	}