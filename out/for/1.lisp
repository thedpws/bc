
 	(program 
 		(statement 
 			(forLoop for 
 				( 
 					(expression 
 						(variable i)
 					 
 						(operatorAssignment =)
 					 
 						(expression 0)
 					)
 				 ; 
 					(condition 
 						(expression 
 							(variable i)
 						)
 					 
 						(comparisonOperator <)
 					 
 						(expression 10)
 					)
 				 ; 
 					(expression 
 						(variable i)
 					 
 						(unaryOperator ++)
 					)
 				 )
 			 
 				(statement { })
 			)
 		)
 	 
 		(statement 
 			(forLoop for 
 				( ; ; )
 			 
 				(statement { })
 			)
 		)
 	 
 		(statement 
 			(forLoop for 
 				( ; ; )
 			 
 				(statement 
 					(expression 
 						(variable i)
 					 
 						(unaryOperator ++)
 					)
 				 
 					(delimiter ;)
 				)
 			)
 		)
 	)
 
