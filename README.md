
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
* 
<br/>
<br/>



**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.**
<br/>
<br/>
<br/>



**F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.**
<br/>
<br/>
<br/>

**G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.**
<br/>
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

