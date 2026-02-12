
import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { MarksheetComponent } from './marksheet/marksheet.component';
import { StudentComponent } from './student/student.component';
import { CollegeComponent } from './college/college.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ForgotPasswordComponent } from './login/forgotpassword.component';
import { SignUpComponent } from './login/signup.component';
import { MessageComponent } from './message/message.component';
import { MessageListComponent } from './message/message-list.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { CollegeListComponent } from './college/college-list.component';
import { StudentListComponent } from './student/student-list.component';
import { UserListComponent } from './user/user-list.component';
import { UserComponent } from './user/user.component';
import { RoleComponent } from './role/role.component';
import { CourseComponent } from "./course/course.component";
import { SubjectComponent } from "./subject/subject.component"
import { Subject, from } from 'rxjs';
import { RoleListComponent } from './role/role-list.component';
import { CourseListComponent } from "./course/course-list.component";
import { FacultyComponent } from "./faculty/faculty.component";
import { FacultyListComponent } from "./faculty/faculty-list.component";
import { TimetableComponent } from "./timetable/timetable.component";
import { FileComponent } from './file/file.component';
import { TimetableListComponent } from './timetable/timetable-list.component';
import { SubjectListComponent } from './subject/subject-list.component';
import { MarksheetmeritListComponent } from "./marksheet/marksheetmerit-list.component";
import { GetmarksheetComponent } from "./marksheet/getmarksheet.component";
import { ChangepasswordComponent } from "./user/changepassword.component";
import { LoaderComponent } from './loader/loader.component';
import { MyprofileComponent } from './user/myprofile.component';
import { ProductComponent } from './product/product.component';
import { ProductListComponent } from './product/product-list.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerlistComponent } from './customer/customer-list.component';
import { OrderComponent } from './order/order.component';
import { OrderlistComponent } from './order/orderlist.component';
import { StaffComponent } from './staff/staff.component';
import { StafflistComponent } from './staff/stafflist.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentlistComponent } from './payment/paymentlist.component';
import { CouponComponent } from './coupon/coupon.component';
import { CouponlistComponent } from './coupon/couponlist.component';
import { ActivityComponent } from './activity/activity.component';
import { ActivitylistComponent } from './activity/activitylist.component';
import { SalaryComponent } from './salary/salary.component';
import { SalarylistComponent } from './salary/salarylist.component';
import { InquiryComponent } from './inquiry/inquiry.component';
import { InquirylistComponent } from './inquiry/inquirylist.component';
import { AttendanceComponent } from './attendance/attendance.component';
import { AttendancelistComponent } from './attendance/attendancelist.component';



const routes: Routes = [
    {
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full'
    },
    {
        path: 'dashboard',
        component: DashboardComponent
    },

    // ***********CUSTOMER*************

    {
        path: 'customer',
        component: CustomerComponent
    },
    {
        path: 'customerlist',
        component: CustomerlistComponent
    },
    {
        path: 'customet/:id',
        component: CustomerComponent
    },

    // ***********PRODUCT*************

    {
        path: 'product',
        component: ProductComponent
    },
    {
        path: 'productlist',
        component: ProductListComponent
    },
    {
        path: 'product/:id',
        component: ProductComponent
    },

    // ======================================
    {
        path: 'loader',
        component: LoaderComponent
    },
    {
        path: 'login',
        component: LoginComponent
    }
    ,
    {
        path: 'login/:userparams',
        component: LoginComponent
    },
    {
        path: 'forgotpassword',
        component: ForgotPasswordComponent
    },
    {
        path: 'signup',
        component: SignUpComponent
    },
    {
        path: 'message',
        component: MessageComponent,
    },
    {
        path: 'message/:id',
        component: MessageComponent
    },
    {
        path: 'messagelist',
        component: MessageListComponent
    },
    {
        path: 'marksheet',
        component: MarksheetComponent
    },
    {
        path: 'marksheet/:id',
        component: MarksheetComponent
    },
    {
        path: 'marksheetlist',
        component: MarksheetListComponent
    },
    {
        path: 'marksheetmeritlist',
        component: MarksheetmeritListComponent
    },
    {
        path: 'getmarksheet',
        component: GetmarksheetComponent
    },
    {
        path: 'college',
        component: CollegeComponent
    },
    {
        path: 'college/:id',
        component: CollegeComponent
    },
    {
        path: 'collegelist',
        component: CollegeListComponent
    },
    {
        path: 'student',
        component: StudentComponent
    },
    {
        path: 'student/:id',
        component: StudentComponent
    },
    {
        path: 'studentlist',
        component: StudentListComponent
    },
    {
        path: 'user',
        component: UserComponent
    },
    {
        path: 'user/:id',
        component: UserComponent
    },
    {
        path: 'userlist',
        component: UserListComponent
    },
    {
        path: 'role',
        component: RoleComponent
    },
    {
        path: 'rolelist',
        component: RoleListComponent
    },
    {
        path: 'role/:id',
        component: RoleComponent
    },
    {
        path: 'course',
        component: CourseComponent
    },
    {
        path: 'courselist',
        component: CourseListComponent
    },
    {
        path: 'course/:id',
        component: CourseComponent
    },
    {
        path: 'faculty',
        component: FacultyComponent
    },
    {
        path: 'facultylist',
        component: FacultyListComponent
    },
    {
        path: 'faculty/:id',
        component: FacultyComponent
    },
    {
        path: 'timetable',
        component: TimetableComponent
    },
    {
        path: 'timetablelist',
        component: TimetableListComponent

    },
    {
        path: 'timetable/:id',
        component: TimetableComponent

    },
    {
        path: 'subject',
        component: SubjectComponent

    },
    {
        path: 'subjectlist',
        component: SubjectListComponent

    },
    {
        path: 'subject/:id',
        component: SubjectComponent

    },
    {
        path: 'myprofile',
        component: MyprofileComponent
    },
    {
        path: 'file',
        component: FileComponent
    },
    {
        path: 'changepassword',
        component: ChangepasswordComponent


    },

    {
        path: 'order',
        component: OrderComponent
    },
    {
        path: 'orderlist',
        component: OrderlistComponent
    },
    {
        path: 'order/:id',
        component: OrderComponent

    },

    {
        path: 'staff',
        component: StaffComponent
    },

    {
        path: 'stafflist',
        component: StafflistComponent

    },
    {
        path: 'staff/:id',
        component: StaffComponent
    },
    {
        path: 'payment',
        component: PaymentComponent
    },
    {
        path: 'paymentlist',
        component: PaymentlistComponent
    },
    {
        path: 'payment/:id',
        component: PaymentComponent
    }, {
        path: 'coupon',
        component: CouponComponent
    },
    {
        path: 'couponlist',
        component: CouponlistComponent
    },
    {
        path: 'coupon/:id',
        component: CouponComponent
    },

    {
        path: 'activity',
        component: ActivityComponent
    },
    {
        path: 'activitylist',
        component: ActivitylistComponent
    },
    {
        path: 'activity/:id',
        component: ActivityComponent
    },
    {
        path: 'salary',
        component: SalaryComponent
    },
    {
        path: 'salarylist',
        component: SalarylistComponent
    },
    {
        path: 'salary/:id',
        component: SalaryComponent
    },

 {
        path: 'inquiry',
        component: InquiryComponent
    },
 {
        path: 'inquirylist',
        component: InquirylistComponent
    },
 {
        path: 'inquiry/:id',
        component: InquiryComponent
    },









    {
        path: 'attendance',
        component: AttendanceComponent
    },
 {
        path: 'attendancelist',
        component: AttendancelistComponent
    },
 {
        path: 'attendance/:id',
        component: AttendanceComponent
    },




];

@NgModule({
    imports: [RouterModule.forRoot(routes, { useHash: true })],
    exports: [RouterModule]
})


export class AppRoutingModule { }