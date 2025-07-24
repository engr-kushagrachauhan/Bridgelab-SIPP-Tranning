package Java_Generics;
interface MealPlan {
    void showMeal();
}

class VegetarianMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegetarian Meal Plan");
    }
}

class VeganMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Vegan Meal Plan");
    }
}

class KetoMeal implements MealPlan {
    public void showMeal() {
        System.out.println("Keto Meal Plan");
    }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) {
        this.plan = plan;
    }
    public void show() {
        plan.showMeal();
    }
}

class MealPlanner {
    public static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generating personalized meal plan:");
        plan.showMeal();
    }
}