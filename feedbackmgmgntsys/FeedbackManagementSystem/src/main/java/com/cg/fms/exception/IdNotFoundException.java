package com.cg.fms.exception;

	
	public class IdNotFoundException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		/**
		 * Class constructor
		 */
		public IdNotFoundException() {

		}

		/**
		 * Class constructor with arguments:
		 * 
		 * @param message
		 * @param cause
		 */
		public IdNotFoundException(String message, Throwable cause) {
			super(message, cause);
		}

		/**
		 * Class constructor with arguments
		 * 
		 * @param message
		 */
		public IdNotFoundException(String message) {
			super(message);
		}

	}



