
 	(program 
 		(statement 
 			(defineFunction define euclidAlg 
 				( 
 					(parameters a , b)
 				 )
 			 { 
 				(statement 
 					(whileLoop while 
 						( 
 							(condition 
 								(expression 
 									(variable b)
 								)
 							 
 								(comparisonOperator !=)
 							 
 								(expression 0)
 							)
 						 )
 					 
 						(statement { 
 							(statement 
 								(ifStatement if 
 									( 
 										(condition 
 											(expression 
 												(variable a)
 											)
 										 
 											(comparisonOperator >)
 										 
 											(expression 
 												(variable b)
 											)
 										)
 									 )
 								 
 									(statement 
 										(expression 
 											(variable a)
 										 
 											(operatorAssignment =)
 										 
 											(expression 
 												(expression 
 													(variable a)
 												)
 											 
 												(binaryOperator -)
 											 
 												(expression 
 													(variable b)
 												)
 											)
 										)
 									 
 										(delimiter ;)
 									)
 								 else 
 									(statement 
 										(expression 
 											(variable b)
 										 
 											(operatorAssignment =)
 										 
 											(expression 
 												(expression 
 													(variable b)
 												)
 											 
 												(binaryOperator -)
 											 
 												(expression 
 													(variable a)
 												)
 											)
 										)
 									 
 										(delimiter ;)
 									)
 								)
 							)
 						 })
 					)
 				)
 			 return 
 				(expression 
 					(variable a)
 				)
 			 ; })
 		)
 	)
 
