package mate.academy.lesson16;

import java.util.Objects;
import java.util.Optional;

public class Main {
        public static void main(String[] args) {
            String order = null; //1
            Optional<String> optional = Optional.ofNullable(order);

            boolean nonNull = Objects.nonNull(order);
            if (nonNull) {
                // mdsnfkjdsfks
            }

            String defaultValue = optional.orElse("default value");
        }
   }
