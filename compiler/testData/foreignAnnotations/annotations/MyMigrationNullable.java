import javax.annotation.*;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

import kotlin.annotation.*;

@Documented
@TypeQualifierNickname
@Nonnull(when = When.MAYBE)
@Retention(RetentionPolicy.RUNTIME)
@Migration
public @interface MyMigrationNullable {

}