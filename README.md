
# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

**C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**
<br/>
* mainscreen.html updated line 14: Changed title to "Killer Keebs"
* mainscreen.html updated line 19: Changed header 1 to "Killer Keebs"
<br/>
<br/>


**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.**
* about.html added to templates
* about.html updated line 5: changed title to "About Killer Keebs"
* about.html added to lines 10-13: added "Our Mission" title along with description of mission statement
* about.html added to lines 16-19: added "Who We Are" section title with description
* about.html added to lines 22-28: added "What We Offer" section with list of offerings
* created AboutController file
* AboutController lines 6-7: created AboutController function with @Controller
* AboutController lines 9-11: created @GetMapping for about page
* mainscreen.html line 20: added button navigation to about page
* about.html lines 9-10: added button navigation to home page, added thematic break

<br/>
<br/>



**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.**
<br/>
<br/>
* BootStrapData.java lines 44-149: Added products and parts to current inventory



**F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.**
<br/>
<br/>
* mainscreen.html line 86: added "Buy Now" button for Products linked to buysuccessful.html
* Created buysuccessful.html and buyunsuccessful.html for user redirecting 
* Created BuyProductController for branch logic to determine purchase ability
* buysuccessful.html lines 8-10: created purchase successful header with button to return to the home page
* Created BuySuccessfulController with mapping 
* buyunsuccessful.html lines 8-10: created purchase unsuccessful header with button to return to the home page
* Created BuyUnsuccessfulController with mapping
* BuyProductController lines 14-32: created buyProduct method to determine success for purchasing product based on inventory level


**G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.**
<br/>
<br/>
* Part.Java lines 35-39: Added fields for maximum and minimum inventory values
* Part.Java lines 65-70: Created constructor method for maxInv and minInv
* Part.Java lines 110-116: Created getter/setter methods for maxInv and minInv
* BootStrapData.Java lines 51-52: Added maxInv and minInv to sample inventory for part1
* BootStrapData.Java lines 71-72: Added maxInv and minInv to sample inventory for part2
* BootStrapData.Java lines 89-90: Added maxInv and minInv to sample inventory for part3
* BootStrapData.Java lines 107-108: Added maxInv and minInv to sample inventory for part4
* BootStrapData.Java lines 125.126: Added maxInv and minInv to sample inventory for part5
* InhousePartForm.html Lines 25-29: added additional text input fields for min/max inventory
* OutsourcedPartForm.html Lines 25-30: added additional text input fields for min/max inventory
* application.properties line 6: renamed persistent storage file to jdbc:h2:file:~/killerkeebs-database
* Created PartInventoryValidator.Java class
* Created ValidPartInventory annotation
* PartInventoryValidator lines 10-29: created methods to validate user input for maxInv field
* ValidPartInventory lines 10-17: created method for validating user input for maxInv field
* Part.java line 32: added PartInventoryValidator annotation
<br/>
<br/>


**H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.**
<br/>
<br/>
<br/>


**I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**
<br/>
<br/>
<br/>

**J.  Remove the class files for any unused validators in order to clean your code.**
<br/>
<br/>
<br/>

