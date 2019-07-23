Feature: Cart Test
User tries to move to cart without adding items

Scenario Outline: The one where the user moves to cart without adding item in it 
Given User open login page of Testme app
When user enters username as <username> and password as <password>
When user search a particular product like headphones
And tries to proceed to payment without add to cart
Then Testme app doesn't display the cart icon

    Examples: 
      |  username | password      | 
      | "lalitha" | "password123" |

