package com.dongseo.business.product;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductVo {
    private int id;
    private String title;
    private String author;
    private String translator;
    private String publisher;
    private int price;
    private BigDecimal discount;
    private int salesRate;
    private int displayFlag;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Override
    public String toString() {
        return "ProductVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", translator='" + translator + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", salesRate=" + salesRate +
                ", displayFlag=" + displayFlag +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public int getSalesRate() {
        return salesRate;
    }

    public void setSalesRate(int salesRate) {
        this.salesRate = salesRate;
    }

    public int getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayFlag(int displayFlag) {
        this.displayFlag = displayFlag;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
