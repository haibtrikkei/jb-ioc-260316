package ra.demo.init_data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ra.demo.common.StatusType;
import ra.demo.model.entity.Category;
import ra.demo.repository.CategoryRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitCategory implements CommandLineRunner {
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Category> categories = List.of(
                new Category(null,"Điện thoại", "Điện thoại di động", StatusType.ACTIVE,null),
                new Category(null,"Điện tử", "Thiết bị điện tử", StatusType.ACTIVE,null),
                new Category(null,"Điện lạnh", "Thiết bị điện lạnh", StatusType.ACTIVE,null),
                new Category(null,"Thời trang", "Thời trang công sở", StatusType.ACTIVE,null)
        );
        categoryRepository.saveAll(categories);
    }
}
