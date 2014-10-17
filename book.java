package booki;


public class book {
	private String AuthorID,Publisher,PublishDate,Price,Title,ISBN;
	public String getPrice() {
		return Price;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title){
		this.Title = Title;   
	}
	public String getAuthorID() {
		return AuthorID;}
	public void setPrice(String Price) {
		this.Price = Price;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN){
		this.ISBN = ISBN;   
	}

	
	public void setAuthorID(String AuthorID){
		this.AuthorID =AuthorID ;   
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String Publisher){
		this.Publisher = Publisher;   
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String PublishDate){
		this.PublishDate = PublishDate;   
	}

}
