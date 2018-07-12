package com.thearaseng.service;

import com.thearaseng.service.category.BadTestCategory;
import com.thearaseng.service.category.GoodTestCategory;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({
        GoodTestCategory.class
})
@Categories.ExcludeCategory({
        BadTestCategory.class
})
@Suite.SuiteClasses({
        HelloWorldTest.class,
        TrackingServiceTest.class
})
public class CategoryTestSuite {
}
