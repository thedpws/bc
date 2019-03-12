
 	(program 
 		(statement 
 			(defineFunction define factorial 
 				( 
 					(parameters x)
 				 )
 			 { return 
 				(expression 
 					(expression 
 						(variable x)
 					)
 				 
 					(binaryOperator *)
 				 
 					(expression 
 						(function factorial)
 					 
 						( 
 							(expression 
 								(expression 
 									(variable x)
 								)
 							 
 								(binaryOperator -)
 							 
 								(expression 1)
 							)
 						 )
 					)
 				)
 			 ; })
 		)
 	)
 
