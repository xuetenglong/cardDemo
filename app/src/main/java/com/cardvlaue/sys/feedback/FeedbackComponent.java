package com.cardvlaue.sys.feedback;

import com.cardvlaue.sys.data.source.TasksRepositoryComponent;
import com.cardvlaue.sys.util.FragmentScoped;
import dagger.Component;

@FragmentScoped
@Component(dependencies = TasksRepositoryComponent.class, modules = FeedbackPresenterModule.class)
interface FeedbackComponent {

    void inject(FeedbackActivity feedbackActivity);
}
