
 	(program 
 		(statement 
 			(ifStatement if 
 				( 
 					(condition 
 						(expression 
 							(variable i)
 						)
 					 
 						(comparisonOperator <)
 					 
 						(expression 0)
 					)
 				 )
 			 
 				(statement { 
 					(statement 
 						(expression 
 							(variable i)
 						 
 							(operatorAssignment *=)
 						 
 							(expression 
 								(unaryOperator -)
 							 
 								(expression 1)
 							)
 						)
 					 
 						(delimiter ;)
 					)
 				 })
 			 else 
 				(statement 
 					(ifStatement if 
 						( 
 							(condition 
 								(expression 
 									(variable i)
 								)
 							 
 								(comparisonOperator ==)
 							 
 								(expression 0)
 							)
 						 )
 					 
 						(statement { 
 							(statement 
 								(expression 
 									(variable i)
 								 
 									(operatorAssignment =)
 								 
 									(expression 1)
 								)
 							 
 								(delimiter ;)
 							)
 						 })
 					 else 
 						(statement 
 							(ifStatement if 
 								( 
 									(condition 
 										(expression 
 											(variable i)
 										)
 									 
 										(comparisonOperator >)
 									 
 										(expression 0)
 									)
 								 )
 							 
 								(statement { 
 									(statement 
 										(expression 
 											(variable i)
 										 
 											(operatorAssignment =)
 										 
 											(expression 
 												(variable i)
 											)
 										)
 									 
 										(delimiter ;)
 									)
 								 })
 							 else 
 								(statement { 
 									(statement 
 										(expression 
 											(variable i)
 										 
 											(operatorAssignment =)
 										 
 											(expression 
 												(unaryOperator -)
 											 
 												(expression 1)
 											)
 										)
 									 
 										(delimiter ;)
 									)
 								 })
 							)
 						)
 					)
 				)
 			)
 		)
 	)
 
